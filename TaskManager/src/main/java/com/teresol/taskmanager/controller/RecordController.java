package com.teresol.taskmanager.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.teresol.taskmanager.entity.Record;
import com.teresol.taskmanager.repository.RecordRepo;
import com.teresol.taskmanager.services.QueryServices;
import com.teresol.taskmanager.services.AssignedRecord;

@CrossOrigin
@RestController
public class RecordController {

	@Autowired
	RecordRepo recordrepo;
	@Autowired
	QueryServices qService;

	@CrossOrigin
	@PostMapping(value = "/addrecord/pkgid/{pkgid}/gid/{groupdid}/cid/{classid}/flines/{flines}/tlines/{tlines}/tid/{tid}")
	public ResponseEntity<Object> addRecords(@PathVariable("pkgid") int packageid,
			@PathVariable("groupdid") int groupid, @PathVariable("classid") int classid,
			@PathVariable("flines") String fromlines, @PathVariable("tlines") String tolines,
			@PathVariable("tid") int teamid) {

		Record records = new Record();
		records.setPid(packageid);
		records.setGid(groupid);
		records.setCid(classid);
		records.setFrom(Integer.parseInt(fromlines));
		records.setTo(Integer.parseInt(tolines));
		records.setTid(teamid);
		Date d = new Date();
		records.setDate(d);
		return new ResponseEntity<Object>(recordrepo.save(records), HttpStatus.OK);
	}

	@GetMapping(value = "/getAssignedRecord/")
	public ResponseEntity<Object> getRecord() {
		List<AssignedRecord> result = qService.getResult();

		return new ResponseEntity<Object>(result, HttpStatus.OK);
	}

	@GetMapping(value = "/getAllRecord/", produces = "application/json")
	public ResponseEntity<Object> getAllRecord() {
		return new ResponseEntity<Object>(qService.getAllRecord(), HttpStatus.OK);
	}

	@GetMapping(value = "/getTeamRecord/{tid}/cid/{cid}", produces = "application/json")
	public ResponseEntity<Object> getTeamRecordByClassId(@PathVariable("tid") int tid, @PathVariable("cid") int cid) {
		return new ResponseEntity<Object>(qService.getTeamRecord(tid, cid), HttpStatus.OK);
	}

	@GetMapping(value = "/getTeamRecord/cid/{cid}")
	public ResponseEntity<Object> getTeamRecordByClassId(@PathVariable("cid") int cid) {
		return new ResponseEntity<Object>(qService.getTeamRecord(cid), HttpStatus.OK);
	}

}

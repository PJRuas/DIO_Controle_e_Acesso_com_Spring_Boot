package com.dio.live.controller;

import com.dio.live.model.WorkingSchedule;
import com.dio.live.service.WorkingScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedule")
public class WorkingScheduleController {
    @Autowired
    WorkingScheduleService workingScheduleService;

    @PostMapping
    public WorkingSchedule createWorkingSchedule(@RequestBody WorkingSchedule workingSchedule){
        return workingScheduleService.saveSchedule(workingSchedule);
    }

    @GetMapping
    public List<WorkingSchedule> getScheduleList(){
        return workingScheduleService.findAll();
    }

    @GetMapping("/{scheduleId}")
    public ResponseEntity<WorkingSchedule> getScheduleById(@PathVariable("scheduleId") Long scheduleId) throws Exception {
        return ResponseEntity.ok(workingScheduleService.getById(scheduleId).orElseThrow(() -> new Exception("Schedule not found.")));

    }

    @PutMapping
    public WorkingSchedule updateWorkingSchedule(@RequestBody WorkingSchedule workingSchedule){
        return workingScheduleService.updateSchedule(workingSchedule);
    }

    @DeleteMapping("/{scheduleId}")
    public void deleteScheduleById(@PathVariable("scheduleId") Long scheduleId) throws Exception {
        try {
            workingScheduleService.deleteSchedule(scheduleId);
        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }
          //  return ResponseEntity;

    }
}

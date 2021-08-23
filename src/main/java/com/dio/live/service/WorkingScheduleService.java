package com.dio.live.service;

import com.dio.live.model.WorkingSchedule;
import com.dio.live.repository.WorkingScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkingScheduleService {

    WorkingScheduleRepository workingScheduleRepository;

    @Autowired
    public WorkingScheduleService(WorkingScheduleRepository workingScheduleRepository){
        this.workingScheduleRepository = workingScheduleRepository;
    }

    public WorkingSchedule saveSchedule (WorkingSchedule workingSchedule){
        return workingScheduleRepository.save(workingSchedule);
    }

    public List<WorkingSchedule> findAll() {
        return workingScheduleRepository.findAll();
    }

    public Optional<WorkingSchedule> getById(Long scheduleId) {
        return workingScheduleRepository.findById(scheduleId);
    }

    public WorkingSchedule updateSchedule (WorkingSchedule workingSchedule){
        return workingScheduleRepository.save(workingSchedule);
    }

    public void deleteSchedule(Long scheduleId) {
        workingScheduleRepository.deleteById(scheduleId);
    }

}

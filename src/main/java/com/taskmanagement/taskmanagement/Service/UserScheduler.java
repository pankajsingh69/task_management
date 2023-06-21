package com.taskmanagement.taskmanagement.Service;

import org.springframework.scheduling.annotation.Scheduled;

public class UserScheduler {
    @Scheduled(fixedRate = 5000) // Run every 5 seconds
    public void performUserCleanup() {
        // Implementation for performing user data cleanup or any other scheduled task
    }

}
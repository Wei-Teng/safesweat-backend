package com.example.safesweatbackend.userbackup;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserBackupWorkoutHistoryRepo extends JpaRepository<UserBackupWorkoutHistory, UserBackupWorkoutHistoryId> {
}

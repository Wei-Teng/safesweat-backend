package com.example.safesweatbackend.userbackup;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserBackupDataRepo extends JpaRepository<UserBackupData, UUID> {
}

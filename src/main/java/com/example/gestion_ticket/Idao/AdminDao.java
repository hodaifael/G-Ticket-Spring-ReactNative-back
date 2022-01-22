package com.example.gestion_ticket.Idao;

import com.example.gestion_ticket.beans.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<Admin,Long> {
}

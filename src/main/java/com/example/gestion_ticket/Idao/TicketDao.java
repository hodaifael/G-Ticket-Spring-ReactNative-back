package com.example.gestion_ticket.Idao;

import com.example.gestion_ticket.beans.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketDao extends JpaRepository<Ticket,Long> {
}

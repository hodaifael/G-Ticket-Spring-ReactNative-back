package com.example.gestion_ticket.services;


import com.example.gestion_ticket.Idao.MessageDao;
import com.example.gestion_ticket.Idao.TicketDao;
import com.example.gestion_ticket.beans.Message;
import com.example.gestion_ticket.beans.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TicketServices {
    private final TicketDao ticketDao;
    @Autowired
    public TicketServices(TicketDao ticketDao){
        this.ticketDao=ticketDao;
    }

    public Ticket addMessage(Ticket Ticket) {

        return ticketDao.save(Ticket);
    }
    public List<Ticket> findAllMessages(){
        return ticketDao.findAll();
    }
    public Ticket updateMessage(Ticket Ticket){
        return ticketDao.save(Ticket);
    }
    public Optional<Ticket> findMessageById (long id){
        return ticketDao.findById(id);
    }
    public void deleteMessage(long id){
        ticketDao.deleteById(id);
    }

}


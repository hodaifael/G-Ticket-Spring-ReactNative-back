package com.example.gestion_ticket.beans;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Message {
    @Id
    private Long id;
    private String body;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ticket_id",nullable=false)
    @JsonBackReference
    private Ticket ticket;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Ticket getTickets() {
        return ticket;
    }

    public void setTickets(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", tickets=" + ticket +
                '}';
    }
}

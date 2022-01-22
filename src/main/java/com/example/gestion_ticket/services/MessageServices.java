package com.example.gestion_ticket.services;

import com.example.gestion_ticket.Idao.MessageDao;
import com.example.gestion_ticket.beans.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MessageServices {

    private final MessageDao messageDao;
    @Autowired
    public MessageServices(MessageDao messageDao){
        this.messageDao=messageDao;
    }

    public Message addMessage(Message Message) {

        return messageDao.save(Message);
    }
    public List<Message> findAllMessages(){
        return messageDao.findAll();
    }
    public Message updateMessage(Message Message){
        return messageDao.save(Message);
    }
    public Optional<Message> findMessageById (long id){
        return messageDao.findById(id);
    }
    public void deleteMessage(long id){
        messageDao.deleteById(id);
    }

}

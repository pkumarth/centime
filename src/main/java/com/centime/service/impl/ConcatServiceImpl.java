package com.centime.service.impl;

import com.centime.models.User;
import com.centime.service.ConcatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConcatServiceImpl implements ConcatService {
    @Override
    public String append(User user) {
        StringBuilder sb = new StringBuilder();
        sb.append(user.getName());
        sb.append(" ");
        sb.append(user.getSurname());
        return sb.toString();
    }
}

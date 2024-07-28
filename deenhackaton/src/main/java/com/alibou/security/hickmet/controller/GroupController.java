package com.alibou.security.hickmet.controller;

import com.alibou.security.hickmet.dto.GroupDTO;
import com.alibou.security.hickmet.model.Groups;
import com.alibou.security.hickmet.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/groups")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping("/trip/{tripId}")
    public List<GroupDTO> getGroupsByTripId(@PathVariable Long tripId) {
        return groupService.getGroupsByTripId(tripId);
    }
}
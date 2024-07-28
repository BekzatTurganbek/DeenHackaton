package com.alibou.security.hickmet.service;

import com.alibou.security.hickmet.dto.GroupDTO;
import com.alibou.security.hickmet.dto.GroupMapper;
import com.alibou.security.hickmet.model.Groups;
import com.alibou.security.hickmet.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;

    public List<GroupDTO> getGroupsByTripId(Long tripId) {
        List<Groups> groups = groupRepository.findByTripId(tripId);
        return groups.stream()
                .map(GroupMapper::toDTO)
                .collect(Collectors.toList());
    }
}
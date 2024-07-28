package com.alibou.security.hickmet.dto;

import com.alibou.security.hickmet.model.Groups;

import java.util.List;
import java.util.stream.Collectors;

public class GroupMapper {
    public static GroupDTO toDTO(Groups group) {
        GroupDTO dto = new GroupDTO();
        dto.setId(group.getId());
//        dto.setTripId(group.getTripId());
        dto.setPilgrimIds(group.getPilgrims().stream()
                .map(pilgrim -> pilgrim.getId())
                .collect(Collectors.toList()));
        return dto;
    }
}
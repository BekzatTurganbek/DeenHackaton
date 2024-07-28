package com.alibou.security.hickmet.dto;


import lombok.Data;

import java.util.List;

@Data
public class GroupDTO {
    private Long id;
    private Long tripId;
    private List<Long> pilgrimIds;

}
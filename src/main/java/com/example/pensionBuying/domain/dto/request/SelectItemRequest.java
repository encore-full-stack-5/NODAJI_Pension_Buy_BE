package com.example.pensionBuying.domain.dto.request;

import com.example.pensionBuying.domain.entity.SelectedNumber;

public record SelectItemRequest(
    String userId,
    Integer round,
    Integer group,
    Integer first,
    Integer second,
    Integer third,
    Integer fourth,
    Integer fifth,
    Integer sixth
) {
    public SelectedNumber toEntity(){
        return SelectedNumber.builder()
            .userId(userId)
            .round(round)
            .groupNum(group)
            .first(first)
            .second(second)
            .third(third)
            .fourth(fourth)
            .fifth(fifth)
            .sixth(sixth)
            .build();
    }
}
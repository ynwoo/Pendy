package com.ssafy.namani.domain.diary.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
public class DiaryUpdateContentRequestDto {

    @NotNull
    private String title; // 일기 제목

    @NotNull
    private String content; // 일기 내용
}

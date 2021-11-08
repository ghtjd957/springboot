package com.hoseong.book.ex1.web.dto;

import com.hoseong.book.ex1.springboot.web.dto.HelloResponseDto;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;


public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
//        assertThat(dto.getName()).isEqulTo(name);
//        assertThat(dto.getAmount()).isEqulTo(amount);
    }

}

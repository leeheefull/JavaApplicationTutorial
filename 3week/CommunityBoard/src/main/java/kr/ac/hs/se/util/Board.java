package kr.ac.hs.se.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum Board {

    ALL_POST("1", "모든 글 보기", "################ 모든 글 보기 ################"),
    FREE_BOARD("2", "자유 게시판", "################ 자유 게시판 ################"),
    GAME_BOARD("3", "게임 게시판", "################ 게임 게시판 ################"),
    MARKET_BOARD("4", "장터 게시판", "################ 장터 게시판 ################"),
    LOGOUT("5", "로그아웃", "################ 로그 아웃 ################");

    private final String no;
    private final String name;
    private final String title;

    public static Board of(String no) throws NullPointerException {
        return Arrays.stream(values())
                .filter(board -> no.equals(board.no))
                .findFirst()
                .orElseThrow(NullPointerException::new);
    }
}

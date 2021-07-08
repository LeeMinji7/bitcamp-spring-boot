package shop.watchawiki.api.Score.repository;

import shop.watchawiki.api.Score.domain.ScoreVO;

import java.util.HashMap;

public class ScoreDao {
    public static HashMap<Integer, ScoreVO> scoreList = new HashMap<Integer, ScoreVO>();

    public static void scores() {
        scoreList.put(171111,
                new ScoreVO(171111, 100, 1111, " "));
        scoreList.put(123456,
                new ScoreVO(123456, 100, 1111, " "));
        scoreList.put(223456,
                new ScoreVO(223456, 200, 1111, " "));
        scoreList.put(323456,
                new ScoreVO(323456, 200, 1111, " "));
        scoreList.put(423456,
                new ScoreVO(423456, 300, 1111, " "));
        scoreList.put(523456,
                new ScoreVO(523456, 300, 1111, " "));
        scoreList.put(623456,
                new ScoreVO(623456, 400, 1111, " "));
        scoreList.put(723456,
                new ScoreVO(723456, 400, 1111, " "));
    }
}

package shop.watchawiki.api.Professor.repository;

import shop.watchawiki.api.Professor.domain.ProfessorVO;

import java.util.HashMap;

public class ProfessorDao {
    public static HashMap<Integer, ProfessorVO> professorList = new HashMap<Integer, ProfessorVO>();

    public static void professorData() {
        professorList.put(1000, new ProfessorVO(1000, "이민지"));
        professorList.put(2000, new ProfessorVO(2000, "조소연"));
        professorList.put(3000, new ProfessorVO(3000, "이주희"));
        professorList.put(4000, new ProfessorVO(4000, "남궁성"));
        professorList.put(5000, new ProfessorVO(5000, "김남준"));
        professorList.put(1111, new ProfessorVO(1111, "홍길동"));
    }
}

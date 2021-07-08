package shop.watchawiki.api.Score.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import shop.watchawiki.api.PreSubject.domain.PreSubjectVO;
import shop.watchawiki.api.Professor.domain.ProfessorVO;
import shop.watchawiki.api.Student.domain.StudentVO;

@Data // getter/setter
@AllArgsConstructor // 매개변수 있는 생성자
@NoArgsConstructor // 기본생성자
public class ScoreVO {
    private StudentVO studentVO;	// 학생 정보
    private PreSubjectVO preSubjectVO; // 지난 학기 과목 정보
    private ProfessorVO professorVO; // 교수 정보
    private String score; 			// 학점

}

package shop.watchawiki.api.OpeningSubject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import shop.watchawiki.api.Department.domain.DepartmentVO;
import shop.watchawiki.api.Professor.domain.ProfessorVO;

@Data // getter/setter
@AllArgsConstructor // 매개변수 있는 생성자
@NoArgsConstructor // 기본생성자
public class OpeningSubjectVO {
    private int subCode;
    private String subName;
    private String subCurriculum;
    private DepartmentVO majorVO;
    private int subGrade;
    private int subCredit;
    private ProfessorVO professorVO;
    private int subMaxNum;
    private int subNowNum;
    private String subTime;
}

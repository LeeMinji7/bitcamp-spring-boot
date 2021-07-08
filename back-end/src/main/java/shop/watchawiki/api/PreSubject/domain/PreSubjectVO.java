package shop.watchawiki.api.PreSubject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter/setter
@AllArgsConstructor // 매개변수 있는 생성자
@NoArgsConstructor // 기본생성자
public class PreSubjectVO {
    private int preSubCode; 	// 지난 학기 수강한 과목코드
    private String preSubName;	// 지난 학기 수강한 과목명
}

package shop.watchawiki.api.Department.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter/setter
@AllArgsConstructor // 매개변수 있는 생성자
@NoArgsConstructor // 기본생성자
public class DepartmentVO {
    private int majorCode;
    private String majorName;
}

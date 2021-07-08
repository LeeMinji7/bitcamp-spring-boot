package shop.watchawiki.api.Student.repository;

import shop.watchawiki.api.Student.domain.StudentVO;

import java.util.HashMap;

public class StudentDao {
    public static HashMap<Integer, StudentVO> list = new HashMap<Integer, StudentVO>();
    public static void studentDataSet() {
        list.put(123456, new StudentVO(123456, "조성현", "Java", 9));
        list.put(223456, new StudentVO(223456, "이주희", "SQL",21));
        list.put(323456, new StudentVO(323456, "이민지", "Java",15));
        list.put(423456, new StudentVO(423456, "이민형", "SQL",9));
        list.put(523456, new StudentVO(523456, "장장희", "Java",21));
        list.put(623456, new StudentVO(623456, "조소연", "SQL",15));
        list.put(723456, new StudentVO(723456, "박인선", "Java",9));
        list.put(171111, new StudentVO(171111, "영희", "Java",9));
    }
}

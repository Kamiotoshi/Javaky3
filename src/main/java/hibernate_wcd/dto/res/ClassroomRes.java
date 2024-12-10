package hibernate_wcd.dto.res;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@Table(name = "classes")
public class ClassroomRes {
    private Long id;
    private String name;
}

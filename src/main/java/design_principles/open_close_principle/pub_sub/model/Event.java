package design_principles.open_close_principle.pub_sub.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Event {
    Object obj;
}

package configuration;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class SysConfig {
    private Level notifications;
    private Level graphics;
    private Level audio;
}

package org.simpleframework.aop.aspect;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.simpleframework.aop.PointcutLocator;

/**
 * @program: simpleframework
 * @description:
 * @author: zjk
 * @create: 2022-05-03 11:42
 **/
@AllArgsConstructor
@Getter
@Setter
public class AspectInfo {
    private int orderIndex;
    private DefaultAspect aspectObject;
    private PointcutLocator pointcutLocator;
}

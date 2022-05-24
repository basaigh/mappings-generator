package org.geysermc.generator.state.type;

import org.apache.commons.lang3.tuple.Pair;
import org.geysermc.generator.state.StateMapper;
import org.geysermc.generator.state.StateRemapper;

@StateRemapper(value = "shrieking", blockRegex = ".*sculk_shrieker$")
public class SculkShriekerShriekingMapper extends StateMapper<Integer> {
    @Override
    public Pair<String, Integer> translateState(String fullIdentifier, String value) {
        return Pair.of("active", Boolean.parseBoolean(value) ? 1 : 0);
    }
}

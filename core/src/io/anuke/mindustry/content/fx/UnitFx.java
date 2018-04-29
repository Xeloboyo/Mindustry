package io.anuke.mindustry.content.fx;

import io.anuke.mindustry.graphics.Palette;
import io.anuke.ucore.core.Effects.Effect;
import io.anuke.ucore.graphics.Draw;
import io.anuke.ucore.graphics.Fill;
import io.anuke.ucore.util.Angles;
import io.anuke.ucore.util.Mathf;

public class UnitFx {
    public static final Effect

    vtolHover = new Effect(40f, e -> {
        float len = e.finpow()*10f;
        float ang = e.rotation + Mathf.randomSeedRange(e.id, 30f);
        Draw.color(Palette.lightFlame);
        Fill.circle(e.x + Angles.trnsx(ang, len), e.y + Angles.trnsy(ang, len), 2f * e.fout());
        Draw.reset();
    });
}

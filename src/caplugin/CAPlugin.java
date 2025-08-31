package caplugin;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.net.Administration.*;
import mindustry.world.blocks.storage.*;

public class CAPlugin extends Plugin{

    public void init(){

        Vars.netServer.admins.addChatFilter((player, text) -> text.replace("heck", "h*ck"));

    }

}

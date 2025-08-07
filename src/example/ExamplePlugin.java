package example;

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

    const id = ["test"];
    var cid = 0;
    //called when game initializes
    //register commands that run on the server
    @Override
    public void registerServerCommands(CommandHandler handler){
        handler.register("file", "File's a name into the Send command.", (args, cid) -> {
            id.Push(args);
            cid = id.findIndex(id => id === args);
                    }
                }
            }
        });
    }
    
    handler.register("send", "Send's messages depending on variables, Use /file for the ID.", args -> {
        
    
    }
}

package me.taylorkelly.mywarp.commands;

import me.taylorkelly.mywarp.LanguageManager;
import me.taylorkelly.mywarp.MyWarp;
import me.taylorkelly.mywarp.data.Searcher;

import org.apache.commons.lang.StringUtils;
import org.bukkit.command.CommandSender;

public class SearchCommand extends BasicCommand implements Command {
    private MyWarp plugin;

    public SearchCommand(MyWarp plugin) {
        super("Search");
        this.plugin = plugin;
        setDescription(LanguageManager.getString("help.description.search"));
        setUsage("/warp search §9<"
                + LanguageManager.getColorlessString("help.usage.query") + ">");
        setArgumentRange(1, 255);
        setIdentifiers("search");
        setPermission("mywarp.warp.basic.search");
    }

    @Override
    public boolean execute(CommandSender executor, String identifier,
            String[] args) {
        Searcher searcher = new Searcher(executor, StringUtils.join(args, ' '),
                plugin.getWarpList());
        searcher.search();
        return true;
    }
}

package io.github.alfiewil1312.zyroac.checks;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class SpeedCheck implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent event) {

        Player player = event.getPlayer();

        // Ignore legitimate movement states.
        if (player.isFlying()
                || player.isGliding()
                || player.isInsideVehicle()
                || player.isSwimming()) {
            return;
        }

        double dx = event.getTo().getX() - event.getFrom().getX();
        double dz = event.getTo().getZ() - event.getFrom().getZ();

        double horizontalDistance = Math.sqrt(dx * dx + dz * dz);

        // Basic detection threshold.
        if (horizontalDistance > 0.85) {
            player.sendMessage("§c[ZyroAC] Suspicious speed detected.");
        }
    }
}

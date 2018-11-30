package us._donut_.bitcoin;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.*;

public class BitcoinAPI {

    private BitcoinManager bitcoinManager;
    private BitcoinMenu bitcoinMenu;
    private Mining mining;

    BitcoinAPI(Bitcoin pluginInstance) {
        bitcoinManager = pluginInstance.getBitcoinManager();
        bitcoinMenu = pluginInstance.getBitcoinMenu();
        mining = pluginInstance.getMining();
    }

    public double getAmountInCirculation() { return bitcoinManager.getBitcoinsInCirculation(); }
    public List<OfflinePlayer> getTopPlayers() { return bitcoinManager.getTopBalPlayers(); }
    public double getAmountInBank() { return bitcoinManager.getAmountInBank(); }
    public double getPurchaseTaxPercentage() { return bitcoinManager.getPurchaseTaxPercentage(); }
    public double getBalance(UUID playerUUID) { return bitcoinManager.getBalance(playerUUID); }
    public int getPuzzlesSolved(UUID playerUUID) { return bitcoinManager.getPuzzlesSolved(playerUUID); }
    public long getBestPuzzleTime(UUID playerUUID) { return bitcoinManager.getBestPuzzleTime(playerUUID); }
    public double getBitcoinsMined(UUID playerUUID) { return bitcoinManager.getBitcoinsMined(playerUUID); }
    public double getBitcoinValue() { return bitcoinManager.getBitcoinValue(); }
    public double getCirculationLimit() { return bitcoinManager.getCirculationLimit(); }
    public String getExchangeCurrencySymbol() { return bitcoinManager.getExchangeCurrencySymbol(); }
    public void setBalance(UUID playerUUID, double balance) { bitcoinManager.setBalance(playerUUID, balance); }
    public void withdraw(UUID playerUUID, double amount) { bitcoinManager.withdraw(playerUUID, amount); }
    public void deposit(UUID playerUUID, double amount) { bitcoinManager.deposit(playerUUID, amount); }
    public void setPuzzlesSolved(UUID playerUUID, int amount) { bitcoinManager.setPuzzlesSolved(playerUUID, amount); }
    public void setBitcoinsMined(UUID playerUUID, double amount) { bitcoinManager.setBitcoinsMined(playerUUID, amount); }
    public void addToBank(double amount) { bitcoinManager.addToBank(amount); }
    public void removeFromBank(double amount) { bitcoinManager.removeFromBank(amount); }
    public void makeValueFluctuate() { bitcoinManager.fluctuate(); }
    public void openMainMenu(Player player) { bitcoinMenu.open(player); }
    public void openMiningInterface(Player player) { mining.openInterface(player); }
}
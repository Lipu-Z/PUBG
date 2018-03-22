package com.hundi.dao;

/**
 * @author LZHONG
 * @package com.hundi.dao
 * @date 3/22/2018
 */
public interface PlayerDao {
    int getKillCount(String playerID);
    int getDeatCount(String playerID);
    int getPlayCount(String playerID);
    int getStatus(String playerID);
}

/*
 * Copyright (C) 2011 - 2021, MyWarp team and contributors
 *
 * This file is part of MyWarp.
 *
 * MyWarp is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MyWarp is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MyWarp. If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * This class is generated by jOOQ
 */
package io.github.mywarp.mywarp.warp.storage.generated.tables;


import io.github.mywarp.mywarp.warp.storage.generated.Keys;
import io.github.mywarp.mywarp.warp.storage.generated.Mywarp;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {"http://www.jooq.org", "jOOQ version:3.6.2"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class WarpPlayerMap extends TableImpl<Record> {

  private static final long serialVersionUID = -1815141539;

  /**
   * The reference instance of <code>mywarp.warp_player_map</code>
   */
  public static final WarpPlayerMap WARP_PLAYER_MAP = new WarpPlayerMap();

  /**
   * The class holding records for this type
   */
  @Override
  public Class<Record> getRecordType() {
    return Record.class;
  }

  /**
   * The column <code>mywarp.warp_player_map.warp_id</code>.
   */
  public final TableField<Record, UInteger>
      WARP_ID =
      createField("warp_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

  /**
   * The column <code>mywarp.warp_player_map.player_id</code>.
   */
  public final TableField<Record, UInteger>
      PLAYER_ID =
      createField("player_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

  /**
   * Create a <code>mywarp.warp_player_map</code> table reference
   */
  public WarpPlayerMap() {
    this("warp_player_map", null);
  }

  /**
   * Create an aliased <code>mywarp.warp_player_map</code> table reference
   */
  public WarpPlayerMap(String alias) {
    this(alias, WARP_PLAYER_MAP);
  }

  private WarpPlayerMap(String alias, Table<Record> aliased) {
    this(alias, aliased, null);
  }

  private WarpPlayerMap(String alias, Table<Record> aliased, Field<?>[] parameters) {
    super(alias, Mywarp.MYWARP, aliased, parameters, "");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public UniqueKey<Record> getPrimaryKey() {
    return Keys.KEY_WARP_PLAYER_MAP_PRIMARY;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<UniqueKey<Record>> getKeys() {
    return Arrays.<UniqueKey<Record>>asList(Keys.KEY_WARP_PLAYER_MAP_PRIMARY);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<ForeignKey<Record, ?>> getReferences() {
    return Arrays.<ForeignKey<Record, ?>>asList(Keys.WARP_PLAYER_MAP_WARP_ID_FK, Keys.WARP_PLAYER_MAP_PLAYER_ID_FK);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public WarpPlayerMap as(String alias) {
    return new WarpPlayerMap(alias, this);
  }

  /**
   * Rename this table
   */
  public WarpPlayerMap rename(String name) {
    return new WarpPlayerMap(name, null);
  }
}

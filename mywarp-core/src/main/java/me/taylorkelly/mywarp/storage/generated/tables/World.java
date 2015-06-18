/*
 * Copyright (C) 2011 - 2015, MyWarp team and contributors
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
package me.taylorkelly.mywarp.storage.generated.tables;


import me.taylorkelly.mywarp.storage.generated.Keys;
import me.taylorkelly.mywarp.storage.generated.Mywarp;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {"http://www.jooq.org", "jOOQ version:3.6.2"},
    comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class World extends TableImpl<Record> {

  private static final long serialVersionUID = -1989568666;

  /**
   * The reference instance of <code>mywarp.world</code>
   */
  public static final World WORLD = new World();

  /**
   * The class holding records for this type
   */
  @Override
  public Class<Record> getRecordType() {
    return Record.class;
  }

  /**
   * The column <code>mywarp.world.world_id</code>.
   */
  public final TableField<Record, UInteger>
      WORLD_ID =
      createField("world_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

  /**
   * The column <code>mywarp.world.uuid</code>.
   */
  public final TableField<Record, UUID> UUID = createField("uuid", org.jooq.impl.SQLDataType.UUID, this, "");

  /**
   * Create a <code>mywarp.world</code> table reference
   */
  public World() {
    this("world", null);
  }

  /**
   * Create an aliased <code>mywarp.world</code> table reference
   */
  public World(String alias) {
    this(alias, WORLD);
  }

  private World(String alias, Table<Record> aliased) {
    this(alias, aliased, null);
  }

  private World(String alias, Table<Record> aliased, Field<?>[] parameters) {
    super(alias, Mywarp.MYWARP, aliased, parameters, "");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Identity<Record, UInteger> getIdentity() {
    return Keys.IDENTITY_WORLD;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public UniqueKey<Record> getPrimaryKey() {
    return Keys.KEY_WORLD_PRIMARY;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<UniqueKey<Record>> getKeys() {
    return Arrays.<UniqueKey<Record>>asList(Keys.KEY_WORLD_PRIMARY, Keys.KEY_WORLD_WORLD_UUID_UQ);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public World as(String alias) {
    return new World(alias, this);
  }

  /**
   * Rename this table
   */
  public World rename(String name) {
    return new World(name, null);
  }
}
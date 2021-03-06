package io.vertx.ext.mongo;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter and mapper for {@link io.vertx.ext.mongo.AggregateOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.mongo.AggregateOptions} original class using Vert.x codegen.
 */
public class AggregateOptionsConverter {


  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, AggregateOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "allowDiskUse":
          if (member.getValue() instanceof Boolean) {
            obj.setAllowDiskUse((Boolean)member.getValue());
          }
          break;
        case "batchSize":
          if (member.getValue() instanceof Number) {
            obj.setBatchSize(((Number)member.getValue()).intValue());
          }
          break;
        case "maxAwaitTime":
          if (member.getValue() instanceof Number) {
            obj.setMaxAwaitTime(((Number)member.getValue()).longValue());
          }
          break;
        case "maxTime":
          if (member.getValue() instanceof Number) {
            obj.setMaxTime(((Number)member.getValue()).longValue());
          }
          break;
      }
    }
  }

  public static void toJson(AggregateOptions obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(AggregateOptions obj, java.util.Map<String, Object> json) {
    if (obj.getAllowDiskUse() != null) {
      json.put("allowDiskUse", obj.getAllowDiskUse());
    }
    json.put("batchSize", obj.getBatchSize());
    json.put("maxAwaitTime", obj.getMaxAwaitTime());
    json.put("maxTime", obj.getMaxTime());
  }
}

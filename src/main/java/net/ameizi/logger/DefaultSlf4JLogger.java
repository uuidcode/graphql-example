package net.ameizi.logger;

import com.p6spy.engine.logging.Category;
import com.p6spy.engine.spy.appender.Slf4JLogger;

import net.ameizi.util.CoreUtil;

public class DefaultSlf4JLogger extends Slf4JLogger {
    @Override
    public void logSQL(int connectionId, String now, long elapsed,
                       Category category, String prepared, String sql) {

        if (CoreUtil.isEmpty(sql)) {
            return;
        }

        if ("select 1".equals(sql)) {
            return;
        }

        super.logSQL(connectionId, now, elapsed, category, prepared, sql);
    }
}

package net.sf.openrocket.startup;

import net.sf.openrocket.formatting.RocketFormatter;
import net.sf.openrocket.formatting.RocketFormatterImpl;
import net.sf.openrocket.gui.watcher.WatchService;
import net.sf.openrocket.gui.watcher.WatchServiceImpl;
import net.sf.openrocket.l10n.Translator;
import net.sf.openrocket.logging.LogHelper;

import com.google.inject.AbstractModule;

public class ApplicationModule extends AbstractModule {
	
	@Override
	protected void configure() {
		bind(LogHelper.class).toInstance(Application.getLogger());
		bind(Preferences.class).toInstance(Application.getPreferences());
		bind(Translator.class).toInstance(Application.getTranslator());
		bind(WatchService.class).to(WatchServiceImpl.class);
		bind(RocketFormatter.class).to(RocketFormatterImpl.class);
	}
	
}

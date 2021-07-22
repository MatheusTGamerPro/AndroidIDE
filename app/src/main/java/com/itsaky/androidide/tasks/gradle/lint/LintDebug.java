package com.itsaky.androidide.tasks.gradle.lint;

import com.itsaky.androidide.R;
import com.itsaky.androidide.app.StudioApp;
import com.itsaky.androidide.services.IDEService;
import com.itsaky.androidide.tasks.BaseGradleTask;
import java.io.File;

public class LintDebug extends BaseGradleTask {
	
	@Override
	public String getName() {
		return StudioApp.getInstance().getString(R.string.lint_debug);
	}
    
    @Override
	public String getCommands() {
		return "lintDebug";
	}

	@Override
	public int getTaskID() {
		return IDEService.TASK_LINT_DEBUG;
	}

	@Override
	public boolean canOutput() {
		return true;
	}

	@Override
	public boolean buildsApk() {
		return false;
	}

	@Override
	public File getApk(String buildFolder, String moduleName) {
		return null;
	}

	@Override
	public Type getType() {
		return Type.LINT;
	}
    
}

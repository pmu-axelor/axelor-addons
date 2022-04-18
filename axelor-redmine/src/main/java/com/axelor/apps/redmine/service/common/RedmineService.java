/*
 * Axelor Business Solutions
 *
 * Copyright (C) 2022 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.redmine.service.common;

import com.axelor.apps.base.db.AppRedmine;
import com.axelor.apps.base.db.Batch;
import com.axelor.exception.AxelorException;
import com.taskadapter.redmineapi.RedmineManager;
import java.util.function.Consumer;

public interface RedmineService {

  public void redmineImportProjects(
      Batch batch, Consumer<Object> onSuccess, Consumer<Throwable> onError);

  public void redmineImportIssues(
      Batch batch, Consumer<Object> onSuccess, Consumer<Throwable> onError);

  public void redmineSyncTimeEntries(
      Batch batch, Consumer<Object> onSuccess, Consumer<Throwable> onError);

  public RedmineManager getRedmineManager(AppRedmine appRedmine) throws AxelorException;
}

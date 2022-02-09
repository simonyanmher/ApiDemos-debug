package com.appium.ApiDemos_debug.utils;

import com.appium.ApiDemos_debug.suites.BaseTest;
import net.rcarz.jiraclient.*;

public class JiraServiceProvider extends BaseTest {
    private final JiraClient client;
    private final String name;

    public JiraServiceProvider(
            String name,
            String url,
            String email,
            String password
    ) {
        this.name = name;

        BasicCredentials credentials = new BasicCredentials(email, password);
        this.client = new JiraClient(url, credentials);
    }

    public void createJiraIssue(
            String type,
            String summary,
            String description
    ) {
        try {
            JQL jql = new JQL(summary);
            Issue.SearchResult result = client.searchIssues(jql.getJQL());

            if (result.total != 0) {
                logger.info("Same Issue Already Exists On Jira!");
                return;
            }

            Issue.FluentCreate create = client.createIssue(name, type);

            create.field(Field.SUMMARY, summary);
            create.field(Field.DESCRIPTION, description);

            Issue issue = create.execute();

            logger.info("New Issue Created In Jira With ID " + issue);
        } catch (JiraException e) {
            e.printStackTrace();
        }
    }
}

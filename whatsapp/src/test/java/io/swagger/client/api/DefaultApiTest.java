/*
 * WhatsApp API
 * A RESTful API for a WhatsApp clone application.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.model.BannedUser;
import io.swagger.client.model.Chat;
import io.swagger.client.model.Contact;
import io.swagger.client.model.Credentials;
import io.swagger.client.model.FriendRequest;
import io.swagger.client.model.FriendRequestStatus;
import io.swagger.client.model.GroupAdmin;
import io.swagger.client.model.GroupPermissions;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.Message;
import io.swagger.client.model.PushNotification;
import io.swagger.client.model.Session;
import io.swagger.client.model.StatusUpdate;
import io.swagger.client.model.SuperAdminPermission;
import java.util.UUID;
import io.swagger.client.model.User;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * Delete a chat
     *
     * Delete the chat with the specified chat ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void chatChatIdDeleteTest() throws Exception {
        UUID chatId = null;
        api.chatChatIdDelete(chatId);

        // TODO: test validations
    }
    
    /**
     * Retrieve chat details
     *
     * Retrieve the details of the chat with the specified chat ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void chatChatIdGetTest() throws Exception {
        UUID chatId = null;
        Chat response = api.chatChatIdGet(chatId);

        // TODO: test validations
    }
    
    /**
     * Retrieve chat messages
     *
     * Retrieve the messages in the chat with the specified chat ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void chatsChatIdMessagesGetTest() throws Exception {
        UUID chatId = null;
        List<Message> response = api.chatsChatIdMessagesGet(chatId);

        // TODO: test validations
    }
    
    /**
     * Send a message
     *
     * Send a message in the chat with the specified chat ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void chatsChatIdMessagesPostTest() throws Exception {
        UUID chatId = null;
        Message message = null;
        Message response = api.chatsChatIdMessagesPost(chatId, message);

        // TODO: test validations
    }
    
    /**
     * Retrieve user&#39;s chats
     *
     * Retrieve the list of chats for the user with the specified user ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void chatsUserIdGetTest() throws Exception {
        UUID userId = null;
        List<Chat> response = api.chatsUserIdGet(userId);

        // TODO: test validations
    }
    
    /**
     * Send a friend request
     *
     * Send a friend request to another user.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void friendRequestsPostTest() throws Exception {
        FriendRequest friendRequest = null;
        FriendRequest response = api.friendRequestsPost(friendRequest);

        // TODO: test validations
    }
    
    /**
     * Accept or reject a friend request
     *
     * Accept or reject the friend request with the specified request ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void friendRequestsRequestIdPutTest() throws Exception {
        UUID requestId = null;
        FriendRequestStatus friendRequestStatus = null;
        FriendRequestStatus response = api.friendRequestsRequestIdPut(requestId, friendRequestStatus);

        // TODO: test validations
    }
    
    /**
     * Remove a friend
     *
     * Remove a friend with the specified friend ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void friendsFriendIdDeleteTest() throws Exception {
        UUID friendId = null;
        api.friendsFriendIdDelete(friendId);

        // TODO: test validations
    }
    
    /**
     * Remove group admin
     *
     * Remove a user as a group admin from the specified group.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void groupGroupIdAdminDeleteTest() throws Exception {
        UUID groupId = null;
        GroupAdmin admin = null;
        api.groupGroupIdAdminDelete(groupId, admin);

        // TODO: test validations
    }
    
    /**
     * Add group admin
     *
     * Add a user as a group admin in the specified group.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void groupGroupIdAdminPostTest() throws Exception {
        UUID groupId = null;
        GroupAdmin admin = null;
        api.groupGroupIdAdminPost(groupId, admin);

        // TODO: test validations
    }
    
    /**
     * Unban user from group
     *
     * Unban a user from the specified group.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void groupGroupIdBannedUsersDeleteTest() throws Exception {
        UUID groupId = null;
        BannedUser user = null;
        api.groupGroupIdBannedUsersDelete(groupId, user);

        // TODO: test validations
    }
    
    /**
     * Ban user from group
     *
     * Ban a user from the specified group.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void groupGroupIdBannedUsersPostTest() throws Exception {
        UUID groupId = null;
        BannedUser user = null;
        api.groupGroupIdBannedUsersPost(groupId, user);

        // TODO: test validations
    }
    
    /**
     * Update group permissions
     *
     * Update the permissions for the specified group.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void groupGroupIdPermissionsPutTest() throws Exception {
        UUID groupId = null;
        GroupPermissions permissions = null;
        api.groupGroupIdPermissionsPut(groupId, permissions);

        // TODO: test validations
    }
    
    /**
     * Authenticate and log in a user
     *
     * Authenticate a user using their phone number and password, returning an access token.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void loginPostTest() throws Exception {
        Credentials credentials = null;
        InlineResponse200 response = api.loginPost(credentials);

        // TODO: test validations
    }
    
    /**
     * Delete a message
     *
     * Delete a message with the specified message ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void messagesMessageIdDeleteTest() throws Exception {
        UUID messageId = null;
        api.messagesMessageIdDelete(messageId);

        // TODO: test validations
    }
    
    /**
     * Update message content
     *
     * Update the content of a message with the specified message ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void messagesMessageIdPutTest() throws Exception {
        UUID messageId = null;
        Message message = null;
        api.messagesMessageIdPut(messageId, message);

        // TODO: test validations
    }
    
    /**
     * Subscribe to push notifications
     *
     * Subscribe the user to push notifications.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void pushNotificationsPostTest() throws Exception {
        PushNotification pushNotification = null;
        PushNotification response = api.pushNotificationsPost(pushNotification);

        // TODO: test validations
    }
    
    /**
     * Unsubscribe from push notifications
     *
     * Unsubscribe the user from push notifications.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void pushNotificationsSubscriptionIdDeleteTest() throws Exception {
        UUID subscriptionId = null;
        api.pushNotificationsSubscriptionIdDelete(subscriptionId);

        // TODO: test validations
    }
    
    /**
     * Register a new user
     *
     * Create a new user account with the provided details.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void registerPostTest() throws Exception {
        User user = null;
        User response = api.registerPost(user);

        // TODO: test validations
    }
    
    /**
     * Create a new session
     *
     * Create a new session for the user.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void sessionsPostTest() throws Exception {
        Session session = null;
        Session response = api.sessionsPost(session);

        // TODO: test validations
    }
    
    /**
     * Delete a session
     *
     * Delete the session with the specified session ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void sessionsSessionIdDeleteTest() throws Exception {
        UUID sessionId = null;
        api.sessionsSessionIdDelete(sessionId);

        // TODO: test validations
    }
    
    /**
     * Retrieve session details
     *
     * Retrieve the details of the session with the specified session ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void sessionsSessionIdGetTest() throws Exception {
        UUID sessionId = null;
        Session response = api.sessionsSessionIdGet(sessionId);

        // TODO: test validations
    }
    
    /**
     * Delete a status update
     *
     * Delete a status update with the specified status ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void statuStatusIdDeleteTest() throws Exception {
        UUID statusId = null;
        api.statuStatusIdDelete(statusId);

        // TODO: test validations
    }
    
    /**
     * Retrieve user&#39;s status updates
     *
     * Retrieve the list of status updates for the user with the specified user ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void statusUserIdGetTest() throws Exception {
        UUID userId = null;
        List<StatusUpdate> response = api.statusUserIdGet(userId);

        // TODO: test validations
    }
    
    /**
     * Add a new status update
     *
     * Add a new status update for the user with the specified user ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void statusUserIdPostTest() throws Exception {
        UUID userId = null;
        StatusUpdate statusUpdate = null;
        StatusUpdate response = api.statusUserIdPost(userId, statusUpdate);

        // TODO: test validations
    }
    
    /**
     * Retrieve a list of super admins
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void superAdminsGetTest() throws Exception {
        List<SuperAdminPermission> response = api.superAdminsGet();

        // TODO: test validations
    }
    
    /**
     * Grant super admin permission to a user
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void superAdminsUserIdPostTest() throws Exception {
        UUID userId = null;
        SuperAdminPermission response = api.superAdminsUserIdPost(userId);

        // TODO: test validations
    }
    
    /**
     * Remove a contact
     *
     * Remove a contact from the user&#39;s contact list.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userUserIdContactsContactIdDeleteTest() throws Exception {
        UUID userId = null;
        UUID contactId = null;
        api.userUserIdContactsContactIdDelete(userId, contactId);

        // TODO: test validations
    }
    
    /**
     * Update contact details
     *
     * Update the details of a contact for the user with the specified user ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userUserIdContactsContactIdPutTest() throws Exception {
        UUID userId = null;
        UUID contactId = null;
        Contact contact = null;
        api.userUserIdContactsContactIdPut(userId, contactId, contact);

        // TODO: test validations
    }
    
    /**
     * Retrieve user&#39;s contacts
     *
     * Retrieve the list of contacts for the user with the specified user ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userUserIdContactsGetTest() throws Exception {
        UUID userId = null;
        List<Contact> response = api.userUserIdContactsGet(userId);

        // TODO: test validations
    }
    
    /**
     * Add a new contact
     *
     * Add a new contact for the user with the specified user ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userUserIdContactsPostTest() throws Exception {
        UUID userId = null;
        Contact contact = null;
        Contact response = api.userUserIdContactsPost(userId, contact);

        // TODO: test validations
    }
    
    /**
     * Delete user account
     *
     * Delete the user account with the specified user ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userUserIdDeleteTest() throws Exception {
        UUID userId = null;
        api.userUserIdDelete(userId);

        // TODO: test validations
    }
    
    /**
     * Retrieve user details
     *
     * Retrieve the details of the user with the specified user ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userUserIdGetTest() throws Exception {
        UUID userId = null;
        User response = api.userUserIdGet(userId);

        // TODO: test validations
    }
    
    /**
     * Update user details
     *
     * Update the details of the user with the specified user ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userUserIdPutTest() throws Exception {
        UUID userId = null;
        User user = null;
        api.userUserIdPut(userId, user);

        // TODO: test validations
    }
    
}

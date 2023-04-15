# DefaultApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chatChatIdDelete**](DefaultApi.md#chatChatIdDelete) | **DELETE** /chat/{chatId} | Delete a chat
[**chatChatIdGet**](DefaultApi.md#chatChatIdGet) | **GET** /chat/{chatId} | Retrieve chat details
[**chatsChatIdMessagesGet**](DefaultApi.md#chatsChatIdMessagesGet) | **GET** /chats/{chatId}/messages | Retrieve chat messages
[**chatsChatIdMessagesPost**](DefaultApi.md#chatsChatIdMessagesPost) | **POST** /chats/{chatId}/messages | Send a message
[**chatsUserIdGet**](DefaultApi.md#chatsUserIdGet) | **GET** /chats/{userId} | Retrieve user&#39;s chats
[**friendRequestsPost**](DefaultApi.md#friendRequestsPost) | **POST** /friend-requests | Send a friend request
[**friendRequestsRequestIdPut**](DefaultApi.md#friendRequestsRequestIdPut) | **PUT** /friend-requests/{requestId} | Accept or reject a friend request
[**friendsFriendIdDelete**](DefaultApi.md#friendsFriendIdDelete) | **DELETE** /friends/{friendId} | Remove a friend
[**groupGroupIdAdminDelete**](DefaultApi.md#groupGroupIdAdminDelete) | **DELETE** /group/{groupId}/admin | Remove group admin
[**groupGroupIdAdminPost**](DefaultApi.md#groupGroupIdAdminPost) | **POST** /group/{groupId}/admin | Add group admin
[**groupGroupIdBannedUsersDelete**](DefaultApi.md#groupGroupIdBannedUsersDelete) | **DELETE** /group/{groupId}/banned-users | Unban user from group
[**groupGroupIdBannedUsersPost**](DefaultApi.md#groupGroupIdBannedUsersPost) | **POST** /group/{groupId}/banned-users | Ban user from group
[**groupGroupIdPermissionsPut**](DefaultApi.md#groupGroupIdPermissionsPut) | **PUT** /group/{groupId}/permissions | Update group permissions
[**loginPost**](DefaultApi.md#loginPost) | **POST** /login | Authenticate and log in a user
[**messagesMessageIdDelete**](DefaultApi.md#messagesMessageIdDelete) | **DELETE** /messages/{messageId} | Delete a message
[**messagesMessageIdPut**](DefaultApi.md#messagesMessageIdPut) | **PUT** /messages/{messageId} | Update message content
[**pushNotificationsPost**](DefaultApi.md#pushNotificationsPost) | **POST** /push-notifications | Subscribe to push notifications
[**pushNotificationsSubscriptionIdDelete**](DefaultApi.md#pushNotificationsSubscriptionIdDelete) | **DELETE** /push-notifications/{subscriptionId} | Unsubscribe from push notifications
[**registerPost**](DefaultApi.md#registerPost) | **POST** /register | Register a new user
[**sessionsPost**](DefaultApi.md#sessionsPost) | **POST** /sessions | Create a new session
[**sessionsSessionIdDelete**](DefaultApi.md#sessionsSessionIdDelete) | **DELETE** /sessions/{sessionId} | Delete a session
[**sessionsSessionIdGet**](DefaultApi.md#sessionsSessionIdGet) | **GET** /sessions/{sessionId} | Retrieve session details
[**statuStatusIdDelete**](DefaultApi.md#statuStatusIdDelete) | **DELETE** /statu/{statusId} | Delete a status update
[**statusUserIdGet**](DefaultApi.md#statusUserIdGet) | **GET** /status/{userId} | Retrieve user&#39;s status updates
[**statusUserIdPost**](DefaultApi.md#statusUserIdPost) | **POST** /status/{userId} | Add a new status update
[**superAdminsGet**](DefaultApi.md#superAdminsGet) | **GET** /superAdmins | Retrieve a list of super admins
[**superAdminsUserIdPost**](DefaultApi.md#superAdminsUserIdPost) | **POST** /superAdmins/{userId} | Grant super admin permission to a user
[**userUserIdContactsContactIdDelete**](DefaultApi.md#userUserIdContactsContactIdDelete) | **DELETE** /user/{userId}/contacts/{contactId} | Remove a contact
[**userUserIdContactsContactIdPut**](DefaultApi.md#userUserIdContactsContactIdPut) | **PUT** /user/{userId}/contacts/{contactId} | Update contact details
[**userUserIdContactsGet**](DefaultApi.md#userUserIdContactsGet) | **GET** /user/{userId}/contacts | Retrieve user&#39;s contacts
[**userUserIdContactsPost**](DefaultApi.md#userUserIdContactsPost) | **POST** /user/{userId}/contacts | Add a new contact
[**userUserIdDelete**](DefaultApi.md#userUserIdDelete) | **DELETE** /user/{userId} | Delete user account
[**userUserIdGet**](DefaultApi.md#userUserIdGet) | **GET** /user/{userId} | Retrieve user details
[**userUserIdPut**](DefaultApi.md#userUserIdPut) | **PUT** /user/{userId} | Update user details


<a name="chatChatIdDelete"></a>
# **chatChatIdDelete**
> chatChatIdDelete(chatId)

Delete a chat

Delete the chat with the specified chat ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID chatId = new UUID(); // UUID | The chat's UUID.
try {
    apiInstance.chatChatIdDelete(chatId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#chatChatIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | [**UUID**](.md)| The chat&#39;s UUID. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="chatChatIdGet"></a>
# **chatChatIdGet**
> Chat chatChatIdGet(chatId)

Retrieve chat details

Retrieve the details of the chat with the specified chat ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID chatId = new UUID(); // UUID | The chat's UUID.
try {
    Chat result = apiInstance.chatChatIdGet(chatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#chatChatIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | [**UUID**](.md)| The chat&#39;s UUID. |

### Return type

[**Chat**](Chat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="chatsChatIdMessagesGet"></a>
# **chatsChatIdMessagesGet**
> List&lt;Message&gt; chatsChatIdMessagesGet(chatId)

Retrieve chat messages

Retrieve the messages in the chat with the specified chat ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID chatId = new UUID(); // UUID | The chat's UUID.
try {
    List<Message> result = apiInstance.chatsChatIdMessagesGet(chatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#chatsChatIdMessagesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | [**UUID**](.md)| The chat&#39;s UUID. |

### Return type

[**List&lt;Message&gt;**](Message.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="chatsChatIdMessagesPost"></a>
# **chatsChatIdMessagesPost**
> Message chatsChatIdMessagesPost(chatId, message)

Send a message

Send a message in the chat with the specified chat ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID chatId = new UUID(); // UUID | The chat's UUID.
Message message = new Message(); // Message | The message object to be sent.
try {
    Message result = apiInstance.chatsChatIdMessagesPost(chatId, message);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#chatsChatIdMessagesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | [**UUID**](.md)| The chat&#39;s UUID. |
 **message** | [**Message**](Message.md)| The message object to be sent. |

### Return type

[**Message**](Message.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="chatsUserIdGet"></a>
# **chatsUserIdGet**
> List&lt;Chat&gt; chatsUserIdGet(userId)

Retrieve user&#39;s chats

Retrieve the list of chats for the user with the specified user ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID userId = new UUID(); // UUID | The user's UUID.
try {
    List<Chat> result = apiInstance.chatsUserIdGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#chatsUserIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| The user&#39;s UUID. |

### Return type

[**List&lt;Chat&gt;**](Chat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="friendRequestsPost"></a>
# **friendRequestsPost**
> FriendRequest friendRequestsPost(friendRequest)

Send a friend request

Send a friend request to another user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FriendRequest friendRequest = new FriendRequest(); // FriendRequest | The friend request object to be sent.
try {
    FriendRequest result = apiInstance.friendRequestsPost(friendRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#friendRequestsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **friendRequest** | [**FriendRequest**](FriendRequest.md)| The friend request object to be sent. |

### Return type

[**FriendRequest**](FriendRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="friendRequestsRequestIdPut"></a>
# **friendRequestsRequestIdPut**
> FriendRequestStatus friendRequestsRequestIdPut(requestId, friendRequestStatus)

Accept or reject a friend request

Accept or reject the friend request with the specified request ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID requestId = new UUID(); // UUID | The friend request's UUID.
FriendRequestStatus friendRequestStatus = new FriendRequestStatus(); // FriendRequestStatus | The updated friend request status object.
try {
    FriendRequestStatus result = apiInstance.friendRequestsRequestIdPut(requestId, friendRequestStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#friendRequestsRequestIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | [**UUID**](.md)| The friend request&#39;s UUID. |
 **friendRequestStatus** | [**FriendRequestStatus**](FriendRequestStatus.md)| The updated friend request status object. |

### Return type

[**FriendRequestStatus**](FriendRequestStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="friendsFriendIdDelete"></a>
# **friendsFriendIdDelete**
> friendsFriendIdDelete(friendId)

Remove a friend

Remove a friend with the specified friend ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID friendId = new UUID(); // UUID | The friend's UUID.
try {
    apiInstance.friendsFriendIdDelete(friendId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#friendsFriendIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **friendId** | [**UUID**](.md)| The friend&#39;s UUID. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="groupGroupIdAdminDelete"></a>
# **groupGroupIdAdminDelete**
> groupGroupIdAdminDelete(groupId, admin)

Remove group admin

Remove a user as a group admin from the specified group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID groupId = new UUID(); // UUID | The group's UUID.
GroupAdmin admin = new GroupAdmin(); // GroupAdmin | The user to be removed as an admin.
try {
    apiInstance.groupGroupIdAdminDelete(groupId, admin);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#groupGroupIdAdminDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**UUID**](.md)| The group&#39;s UUID. |
 **admin** | [**GroupAdmin**](GroupAdmin.md)| The user to be removed as an admin. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="groupGroupIdAdminPost"></a>
# **groupGroupIdAdminPost**
> groupGroupIdAdminPost(groupId, admin)

Add group admin

Add a user as a group admin in the specified group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID groupId = new UUID(); // UUID | The group's UUID.
GroupAdmin admin = new GroupAdmin(); // GroupAdmin | The user to be added as an admin.
try {
    apiInstance.groupGroupIdAdminPost(groupId, admin);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#groupGroupIdAdminPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**UUID**](.md)| The group&#39;s UUID. |
 **admin** | [**GroupAdmin**](GroupAdmin.md)| The user to be added as an admin. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="groupGroupIdBannedUsersDelete"></a>
# **groupGroupIdBannedUsersDelete**
> groupGroupIdBannedUsersDelete(groupId, user)

Unban user from group

Unban a user from the specified group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID groupId = new UUID(); // UUID | The group's UUID.
BannedUser user = new BannedUser(); // BannedUser | The user to be unbanned.
try {
    apiInstance.groupGroupIdBannedUsersDelete(groupId, user);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#groupGroupIdBannedUsersDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**UUID**](.md)| The group&#39;s UUID. |
 **user** | [**BannedUser**](BannedUser.md)| The user to be unbanned. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="groupGroupIdBannedUsersPost"></a>
# **groupGroupIdBannedUsersPost**
> groupGroupIdBannedUsersPost(groupId, user)

Ban user from group

Ban a user from the specified group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID groupId = new UUID(); // UUID | The group's UUID.
BannedUser user = new BannedUser(); // BannedUser | The user to be banned.
try {
    apiInstance.groupGroupIdBannedUsersPost(groupId, user);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#groupGroupIdBannedUsersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**UUID**](.md)| The group&#39;s UUID. |
 **user** | [**BannedUser**](BannedUser.md)| The user to be banned. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="groupGroupIdPermissionsPut"></a>
# **groupGroupIdPermissionsPut**
> groupGroupIdPermissionsPut(groupId, permissions)

Update group permissions

Update the permissions for the specified group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID groupId = new UUID(); // UUID | The group's UUID.
GroupPermissions permissions = new GroupPermissions(); // GroupPermissions | The updated permissions object.
try {
    apiInstance.groupGroupIdPermissionsPut(groupId, permissions);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#groupGroupIdPermissionsPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**UUID**](.md)| The group&#39;s UUID. |
 **permissions** | [**GroupPermissions**](GroupPermissions.md)| The updated permissions object. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loginPost"></a>
# **loginPost**
> InlineResponse200 loginPost(credentials)

Authenticate and log in a user

Authenticate a user using their phone number and password, returning an access token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Credentials credentials = new Credentials(); // Credentials | The user's phone number and password.
try {
    InlineResponse200 result = apiInstance.loginPost(credentials);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#loginPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **credentials** | [**Credentials**](Credentials.md)| The user&#39;s phone number and password. |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="messagesMessageIdDelete"></a>
# **messagesMessageIdDelete**
> messagesMessageIdDelete(messageId)

Delete a message

Delete a message with the specified message ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID messageId = new UUID(); // UUID | The message's UUID.
try {
    apiInstance.messagesMessageIdDelete(messageId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#messagesMessageIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | [**UUID**](.md)| The message&#39;s UUID. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="messagesMessageIdPut"></a>
# **messagesMessageIdPut**
> messagesMessageIdPut(messageId, message)

Update message content

Update the content of a message with the specified message ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID messageId = new UUID(); // UUID | The message's UUID.
Message message = new Message(); // Message | The message object with updated content.
try {
    apiInstance.messagesMessageIdPut(messageId, message);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#messagesMessageIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | [**UUID**](.md)| The message&#39;s UUID. |
 **message** | [**Message**](Message.md)| The message object with updated content. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pushNotificationsPost"></a>
# **pushNotificationsPost**
> PushNotification pushNotificationsPost(pushNotification)

Subscribe to push notifications

Subscribe the user to push notifications.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
PushNotification pushNotification = new PushNotification(); // PushNotification | The push notification object.
try {
    PushNotification result = apiInstance.pushNotificationsPost(pushNotification);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pushNotificationsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pushNotification** | [**PushNotification**](PushNotification.md)| The push notification object. |

### Return type

[**PushNotification**](PushNotification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pushNotificationsSubscriptionIdDelete"></a>
# **pushNotificationsSubscriptionIdDelete**
> pushNotificationsSubscriptionIdDelete(subscriptionId)

Unsubscribe from push notifications

Unsubscribe the user from push notifications.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID subscriptionId = new UUID(); // UUID | The push notification subscription's UUID.
try {
    apiInstance.pushNotificationsSubscriptionIdDelete(subscriptionId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pushNotificationsSubscriptionIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | [**UUID**](.md)| The push notification subscription&#39;s UUID. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registerPost"></a>
# **registerPost**
> User registerPost(user)

Register a new user

Create a new user account with the provided details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
User user = new User(); // User | The user object to be created.
try {
    User result = apiInstance.registerPost(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#registerPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)| The user object to be created. |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sessionsPost"></a>
# **sessionsPost**
> Session sessionsPost(session)

Create a new session

Create a new session for the user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Session session = new Session(); // Session | The session object to be created.
try {
    Session result = apiInstance.sessionsPost(session);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#sessionsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session** | [**Session**](Session.md)| The session object to be created. |

### Return type

[**Session**](Session.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sessionsSessionIdDelete"></a>
# **sessionsSessionIdDelete**
> sessionsSessionIdDelete(sessionId)

Delete a session

Delete the session with the specified session ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID sessionId = new UUID(); // UUID | The session's UUID.
try {
    apiInstance.sessionsSessionIdDelete(sessionId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#sessionsSessionIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | [**UUID**](.md)| The session&#39;s UUID. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sessionsSessionIdGet"></a>
# **sessionsSessionIdGet**
> Session sessionsSessionIdGet(sessionId)

Retrieve session details

Retrieve the details of the session with the specified session ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID sessionId = new UUID(); // UUID | The session's UUID.
try {
    Session result = apiInstance.sessionsSessionIdGet(sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#sessionsSessionIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | [**UUID**](.md)| The session&#39;s UUID. |

### Return type

[**Session**](Session.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="statuStatusIdDelete"></a>
# **statuStatusIdDelete**
> statuStatusIdDelete(statusId)

Delete a status update

Delete a status update with the specified status ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID statusId = new UUID(); // UUID | The status update's UUID.
try {
    apiInstance.statuStatusIdDelete(statusId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#statuStatusIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statusId** | [**UUID**](.md)| The status update&#39;s UUID. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="statusUserIdGet"></a>
# **statusUserIdGet**
> List&lt;StatusUpdate&gt; statusUserIdGet(userId)

Retrieve user&#39;s status updates

Retrieve the list of status updates for the user with the specified user ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID userId = new UUID(); // UUID | The user's UUID.
try {
    List<StatusUpdate> result = apiInstance.statusUserIdGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#statusUserIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| The user&#39;s UUID. |

### Return type

[**List&lt;StatusUpdate&gt;**](StatusUpdate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="statusUserIdPost"></a>
# **statusUserIdPost**
> StatusUpdate statusUserIdPost(userId, statusUpdate)

Add a new status update

Add a new status update for the user with the specified user ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID userId = new UUID(); // UUID | The user's UUID.
StatusUpdate statusUpdate = new StatusUpdate(); // StatusUpdate | The status update object to be added.
try {
    StatusUpdate result = apiInstance.statusUserIdPost(userId, statusUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#statusUserIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| The user&#39;s UUID. |
 **statusUpdate** | [**StatusUpdate**](StatusUpdate.md)| The status update object to be added. |

### Return type

[**StatusUpdate**](StatusUpdate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="superAdminsGet"></a>
# **superAdminsGet**
> List&lt;SuperAdminPermission&gt; superAdminsGet()

Retrieve a list of super admins

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<SuperAdminPermission> result = apiInstance.superAdminsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#superAdminsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SuperAdminPermission&gt;**](SuperAdminPermission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="superAdminsUserIdPost"></a>
# **superAdminsUserIdPost**
> SuperAdminPermission superAdminsUserIdPost(userId)

Grant super admin permission to a user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID userId = new UUID(); // UUID | The UUID of the user to grant super admin permission to.
try {
    SuperAdminPermission result = apiInstance.superAdminsUserIdPost(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#superAdminsUserIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| The UUID of the user to grant super admin permission to. |

### Return type

[**SuperAdminPermission**](SuperAdminPermission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userUserIdContactsContactIdDelete"></a>
# **userUserIdContactsContactIdDelete**
> userUserIdContactsContactIdDelete(userId, contactId)

Remove a contact

Remove a contact from the user&#39;s contact list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID userId = new UUID(); // UUID | The user's UUID.
UUID contactId = new UUID(); // UUID | The contact's UUID.
try {
    apiInstance.userUserIdContactsContactIdDelete(userId, contactId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#userUserIdContactsContactIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| The user&#39;s UUID. |
 **contactId** | [**UUID**](.md)| The contact&#39;s UUID. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userUserIdContactsContactIdPut"></a>
# **userUserIdContactsContactIdPut**
> userUserIdContactsContactIdPut(userId, contactId, contact)

Update contact details

Update the details of a contact for the user with the specified user ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID userId = new UUID(); // UUID | The user's UUID.
UUID contactId = new UUID(); // UUID | The contact's UUID.
Contact contact = new Contact(); // Contact | The contact object with updated details.
try {
    apiInstance.userUserIdContactsContactIdPut(userId, contactId, contact);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#userUserIdContactsContactIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| The user&#39;s UUID. |
 **contactId** | [**UUID**](.md)| The contact&#39;s UUID. |
 **contact** | [**Contact**](Contact.md)| The contact object with updated details. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userUserIdContactsGet"></a>
# **userUserIdContactsGet**
> List&lt;Contact&gt; userUserIdContactsGet(userId)

Retrieve user&#39;s contacts

Retrieve the list of contacts for the user with the specified user ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID userId = new UUID(); // UUID | The user's UUID.
try {
    List<Contact> result = apiInstance.userUserIdContactsGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#userUserIdContactsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| The user&#39;s UUID. |

### Return type

[**List&lt;Contact&gt;**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userUserIdContactsPost"></a>
# **userUserIdContactsPost**
> Contact userUserIdContactsPost(userId, contact)

Add a new contact

Add a new contact for the user with the specified user ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID userId = new UUID(); // UUID | The user's UUID.
Contact contact = new Contact(); // Contact | The contact object to be added.
try {
    Contact result = apiInstance.userUserIdContactsPost(userId, contact);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#userUserIdContactsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| The user&#39;s UUID. |
 **contact** | [**Contact**](Contact.md)| The contact object to be added. |

### Return type

[**Contact**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userUserIdDelete"></a>
# **userUserIdDelete**
> userUserIdDelete(userId)

Delete user account

Delete the user account with the specified user ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID userId = new UUID(); // UUID | The user's UUID.
try {
    apiInstance.userUserIdDelete(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#userUserIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| The user&#39;s UUID. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userUserIdGet"></a>
# **userUserIdGet**
> User userUserIdGet(userId)

Retrieve user details

Retrieve the details of the user with the specified user ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID userId = new UUID(); // UUID | The user's UUID.
try {
    User result = apiInstance.userUserIdGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#userUserIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| The user&#39;s UUID. |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userUserIdPut"></a>
# **userUserIdPut**
> userUserIdPut(userId, user)

Update user details

Update the details of the user with the specified user ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID userId = new UUID(); // UUID | The user's UUID.
User user = new User(); // User | The user object with updated details.
try {
    apiInstance.userUserIdPut(userId, user);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#userUserIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| The user&#39;s UUID. |
 **user** | [**User**](User.md)| The user object with updated details. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


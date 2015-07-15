var exec = require('cordova/exec');

exports.init = function() {
    exec(null, null, "RongCloudIm", "init", []);
};

exports.connect = function(token, success, error) {
    exec(success, error, "RongCloudIm", "connect", [token]);
};

exports.sendFirstMessage = function(userId, msg) {
    exec(null, null, "RongCloudIm", "sendFirstMessage", [userId, msg]);
};

exports.startPrivateChat = function(userId, title) {
    exec(null, null, "RongCloudIm", "startPrivateChat", [userId, title]);
};

exports.startConversationList = function() {
    exec(null, null, "RongCloudIm", "startConversationList", []);
};

exports.startConversationGroupList = function() {
    exec(null, null, "RongCloudIm", "startConversationGroupList", []);
};

exports.addUserInfo = function(userId, userName, portraitUri) {
    exec(null, null, "RongCloudIm", "addUserInfo", [userId, userName, portraitUri]);
}


class NoDRY {

    modifyContent(user, content) {
        if(user.login() === false)
            return
        if(user.getId() !== content.getUserId())
            return
        if(user.isAdmin() === false)
            return
    }

    removeContent(user, content) {
        if(user.login() === false)
            return
        if(user.getId() !== content.getUserId())
            return
        if(user.isAdmin() === false)
            return
    }
}

class DRY {

    isContentWriteAuthority(user, content) {
        if (user.login() === false)
            return false
        if (user.getId() !== content.getUserId())
            return false
        if (user.isAdmin() === false)
            return false

        return true
    }

    modifyContent(user, content) {
        if(this.isContentWriteAuthority(user, content) === false)
            return
    }

    removeContent(user, content) {
        if(this.isContentWriteAuthority(user, content) === false)
            return
    }
}

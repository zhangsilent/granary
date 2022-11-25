
(function(a) {
    var g = a(window),
        b = a("body"),
        f = a(".main-wrapper");
    var d = a(".header-search-toggle"),
        c = a(".header-search"),
        e;
    d.on("click", function(n) {
        n.preventDefault();
        c.addClass("open")
    });
    b.on("click", function(n) {
        if (n.target !== ".header-search-form" && !n.target.closest(".header-search")) {
            c.removeClass("open")
        }
    });
    e = function() {
        if (g.width() >= 768) {
            c.removeClass("open")
        }
    };
    e();
    a(".sidenav-toggle").on("click", function() {
        f.toggleClass("sidenav-open")
    });
    a("#sidenav-menu").on("click", "a", function(o) {
        var n = a(this);
        if (n.attr("href") === "#") {
            o.preventDefault();
            if (n.siblings(".sub-menu:visible").length) {
                console.log("visible");
                n.parent().removeClass("open").find(".sub-menu").slideUp().parent().removeClass("open")
            } else {
                console.log("not visible");
                n.siblings(".sub-menu").slideDown().parent().addClass("open").siblings().find(".sub-menu").slideUp().parent().removeClass("open")
            }
        }
    });
    b.on("click", function(n) {
        if (n.target !== ".sidenav-toggle" && !n.target.closest(".sidenav-toggle, .sidenav-section")) {
            f.removeClass("sidenav-open")
        }
    });
    var j = [].slice.call(document.querySelectorAll('[data-bs-toggle="popover"]'));
    var i = j.map(function(n) {
        return new bootstrap.Popover(n)
    });
    var m = [].slice.call(document.querySelectorAll('[data-bs-toggle="tooltip"]'));
    var l = m.map(function(n) {
        return new bootstrap.Tooltip(n)
    });
    feather.replace();

    function k() {
        e()
    }
    g.on("resize", function() {
        k()
    });
    var h = window.location.href.substr(window.location.href.lastIndexOf("/") + 1);
    a("#sidenav-menu a").each(function() {
        if (a(this).attr("href") === h || a(this).attr("href") === "") {
            a(this).closest("li").addClass("open").parents("li").addClass("open").children("ul").slideDown()
        } else {
            if (window.location.pathname === "/" || window.location.pathname === "/index.html") {
                a('#sidenav-menu a[href="index.html"]').closest("li").addClass("active").parents("li").addClass("active").children("ul").slideDown()
            }
        }
    })
})(jQuery);

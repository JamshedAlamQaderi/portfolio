// Replace paths unavailable during compilation with `null`, so they will not be shown in devtools
;
(() => {
    config.devServer = {
        ...config.devServer, // This will spread the existing devServer configuration
        historyApiFallback: {
            index: '/index.html'
        }
    }
})();
const path = require('path');
const createVueLoaderOptions = require('./vue-loader.config')

const isDev = process.env.NODE_ENV === 'development'

module.exports = {
  entry: path.join(__dirname, 'src/index.js'),
  output: {
    filename: 'bundle.js',
    path: path.join(__dirname, 'dist')
  }
  ,module: {
    rules: [
      {
        test: /.vue$/,
        loader: 'vue-loader'
        ,options: createVueLoaderOptions(isDev)
      },
      {
        test:/.css$/,
        use:[
            'style-loader',
            'css-loader'
        ]
    }
    ]
  }
  // ,plugins: [
  //   new VueLoaderPlugin()
  // ]
}
